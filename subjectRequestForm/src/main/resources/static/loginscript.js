window.onload = function() {
    sessionStorage.clear();
}

document.querySelector('form').addEventListener('submit', function (event) {
    event.preventDefault();
    var formData = new FormData(document.querySelector("form"));
    const username = formData.get("username");
    const password = formData.get("password");
    if (username === "" || password === "") {
        const resultElement = document.getElementById('result');
        resultElement.textContent = 'โปรดกรอกชื่อผู้ใช้และรหัสผ่านที่ถูกต้อง';
        return;
    }
    else {
        login(username, password);
    }
});
function login(user, pass) {
    const loginData = {};
    loginData.UserName = user;
    loginData.PassWord = pass;

    var jsonData = JSON.stringify(loginData);
        fetch('https://restapi.tu.ac.th/api/v1/auth/Ad/verify', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Application-Key': 'TU7908dee6d8b885c29f0457b4b709233032e25f50e6554a70f84832c60159d12e3b0bd6aa3c4332012bcf227261a0b51c'
            },
            body: jsonData
        })
        .then(response => response.json())
        .then(data => {
            // Display a success message on the web page
            const resultElement = document.getElementById('result');
            resultElement.textContent = JSON.stringify(data);
            var userData = JSON.parse(JSON.stringify(data));
            if (!userData["status"]) {
                const resultElement = document.getElementById('result');
                resultElement.textContent = 'ชื่อผู้ใช้ และ/หรือ รหัสผ่านไม่ถูกต้อง';
                return;
            }
            for (let key in userData) {
                sessionStorage.setItem(key, userData[key]);
            }
            resultElement.style.color = 'green'; // Optional: Change the text color to green
            resultElement.style.fontWeight = 'bold'; // Optional: Make the text bold
            window.location = "main.html";
        })
        .catch(error => {
            // Display an error message on the web page
            const resultElement = document.getElementById('result');
            resultElement.textContent = 'การเข้าสู่ระบบไม่สำเร็จ';
            resultElement.style.color = 'red'; // Optional: Change the text color to red
            resultElement.style.fontWeight = 'bold'; // Optional: Make the text bold
        });
}