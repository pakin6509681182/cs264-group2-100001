window.onload = fetchAddDrop(sessionStorage.getItem("username"));

function fetchAddDrop(id) {
    fetch("/users/getAddDropDataById?id=" + id)
        .then(response => response.json())
        .then(data => {
            var userData = JSON.parse(data);
            for (let entry in userData) {
                let i = 0;
                for (let [key, value] in entry) {
                    var dataTableBody;
                    if (i < 70) {
                        dataTableBody = document.querySelector(".add-table tbody");
                    }
                    else {
                        dataTableBody = document.querySelector(".remove-table tbody");

                    }
                    if (i < 17) {
                        document.getElementById(key).innerHTML = value;
                        i++;
                    }
                    else {
                        if ((i - 17) % 7 === 0) {
                            var newRow = document.createElement("tr");
                        }
                        var cell = document.createElement("td");
                        cell.id = key;
                        cell.innerHTML = value;
                        newRow.appendChild(cell);
                        addTableBody.appendChild(newRow);
                        i++

                    }

                }
            }
        })
        .catch(error => {
        });
}