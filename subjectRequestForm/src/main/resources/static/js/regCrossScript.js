document.addEventListener('DOMContentLoaded', function() {
    let formSubmitted = false;
    document.getElementById('userForm').addEventListener('submit', function(event) {
        event.preventDefault();
        if (!formSubmitted) {
            formSubmitted = true;
            submitForm();
        }
    });
    function submitForm() {
        console.log(add_courses_table.rows[1].cells[0].querySelector('input').value);
        console.log(add_courses_table.rows[2].cells[0].querySelector('input').value);
            const formData = new FormData(document.getElementById('userForm'));
            const user = {
                date: formData.get('date'),
                prefix: formData.get('prefix'),
                studentFirstName: formData.get('studentFirstName'),
                lastname: formData.get('lastname'),
                studentId: formData.get('studentId'),
                studentYear: formData.get('studentYear'),
                studentField: formData.get('studentField'),
                advisor: formData.get('advisor'),
                adressNumber: formData.get('adressNumber'),
                moo: formData.get('moo'),
                tumbol: formData.get('tumbol'),
                amphur: formData.get('amphur'),
                province: formData.get('province'),
                postalCode: formData.get('postalCode'),
                mobilePhone: formData.get('mobilePhone'),
                phone: formData.get('phone'),
                reg: formData.get('reg'),
                code: formData.get('code'),
                section: formData.get('section'),
                semester: formData.get('semester'),
                year: formData.get('year'),  
                teacher: formData.get('teacher'),     
                reason: formData.get('reason')         
            };

            fetch('/users', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(user)
            })
            .then(response => {
                if (response.ok) {
                    // Reset the form fields after a successful submission
                    document.getElementById('userForm').reset();
                    document.getElementById('result').innerText = 'บันทึกข้อมูลสำเร็จ';
                    formSubmitted = false; // Reset the flag
                } /*else {
                    response.text().then(errorMessage => {
                        document.getElementById('result').innerText = 'An error occurred while saving the user. Error message: ' + errorMessage;
                    });
                }*/
            })
            .catch(error => {
                console.error('Error:', error);
                document.getElementById('result').innerText = 'An error occurred while saving the user.';
            });
        }
    });

    // for(let k = 0 ; k<10 ; k++){
    //     addCourse('drop_courses_table');
    // }
    /*function addCourse(tableId) {
        const table = document.getElementById(tableId);
        const newRow = table.insertRow();
    
        for (let i = 0; i < 7; i++) {
            const cell = newRow.insertCell(i);
            const input = document.createElement('input');
            if (i == 2 || i == 4) {
                input.type = 'number';
            } else if (i == 6) {
                input.type = 'checkbox';
            } else if (i == 3) {
                input.type = 'datetime-local';
            } else {
                input.type = 'text';
            }
            input.name = `${tableId}[${table.rows.length}][${i}]`; // Set unique name
            cell.appendChild(input);
        }
    }   function removeCourse(tableId) {
            const table = document.getElementById(tableId);
            const rowCount = table.rows.length;
    
            if (rowCount > 1) {
                table.deleteRow(rowCount - 1);
            }
        }
    
        function updateTable(tableId, numRows) {
                const table = document.getElementById(tableId);
    
                // ลบแถวทั้งหมดที่มีอยู่
                while (table.rows.length > 1) {
                    table.deleteRow(1);
                }
    
                // เพิ่มแถวใหม่ตามจำนวนที่ระบุ
                for (let i = 0; i < numRows; i++) {
                    const newRow = table.insertRow();
                    for (let i = 0; i < 7; i++) {
                    const cell = newRow.insertCell(i);
                    const input = document.createElement('input');
                    if(i == 2 || i == 4){
                        input.type = 'number';
                    }
                    else if(i== 6){
                        input.type = 'checkbox';
                    }
                    else if(i== 3){
                        input.type = 'datetime-local';
                    }
                    else{
                    input.type = 'text';
    
                    }
                    cell.appendChild(input);
                }
                }
            }*/