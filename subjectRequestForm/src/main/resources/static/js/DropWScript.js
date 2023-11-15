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
                cause: formData.get('cause'),
                dropCourse1Code: drop_courses_table.rows[1].cells[0].querySelector('input').value,
                dropCourse1Name: drop_courses_table.rows[1].cells[1].querySelector('input').value,
                dropCourse1Section: drop_courses_table.rows[1].cells[2].querySelector('input').value,
                dropCourse1DayAndTime: drop_courses_table.rows[1].cells[3].querySelector('input').value,
                dropCourse1Credits: drop_courses_table.rows[1].cells[4].querySelector('input').value,
                dropCourse1InstructorName: drop_courses_table.rows[1].cells[5].querySelector('input').value,
                dropCourse1InstructorPermission: drop_courses_table.rows[1].cells[6].querySelector('input').checked,

                dropCourse2Code: drop_courses_table.rows[2].cells[0].querySelector('input').value,
                dropCourse2Name: drop_courses_table.rows[2].cells[1].querySelector('input').value,
                dropCourse2Section: drop_courses_table.rows[2].cells[2].querySelector('input').value,
                dropCourse2DayAndTime: drop_courses_table.rows[2].cells[3].querySelector('input').value,
                dropCourse2Credits: drop_courses_table.rows[2].cells[4].querySelector('input').value,
                dropCourse2InstructorName: drop_courses_table.rows[2].cells[5].querySelector('input').value,
                dropCourse2InstructorPermission: drop_courses_table.rows[2].cells[6].querySelector('input').checked,

                dropCourse3Code: drop_courses_table.rows[3].cells[0].querySelector('input').value,
                dropCourse3Name: drop_courses_table.rows[3].cells[1].querySelector('input').value,
                dropCourse3Section: drop_courses_table.rows[3].cells[2].querySelector('input').value,
                dropCourse3DayAndTime: drop_courses_table.rows[3].cells[3].querySelector('input').value,
                dropCourse3Credits: drop_courses_table.rows[3].cells[4].querySelector('input').value,
                dropCourse3InstructorName: drop_courses_table.rows[3].cells[5].querySelector('input').value,
                dropCourse3InstructorPermission: drop_courses_table.rows[3].cells[6].querySelector('input').checked,

                dropCourse4Code: drop_courses_table.rows[4].cells[0].querySelector('input').value,
                dropCourse4Name: drop_courses_table.rows[4].cells[1].querySelector('input').value,
                dropCourse4Section: drop_courses_table.rows[4].cells[2].querySelector('input').value,
                dropCourse4DayAndTime: drop_courses_table.rows[4].cells[3].querySelector('input').value,
                dropCourse4Credits: drop_courses_table.rows[4].cells[4].querySelector('input').value,
                dropCourse4InstructorName: drop_courses_table.rows[4].cells[5].querySelector('input').value,
                dropCourse4InstructorPermission: drop_courses_table.rows[4].cells[6].querySelector('input').checked,

                dropCourse5Code: drop_courses_table.rows[5].cells[0].querySelector('input').value,
                dropCourse5Name: drop_courses_table.rows[5].cells[1].querySelector('input').value,
                dropCourse5Section: drop_courses_table.rows[5].cells[2].querySelector('input').value,
                dropCourse5DayAndTime: drop_courses_table.rows[5].cells[3].querySelector('input').value,
                dropCourse5Credits: drop_courses_table.rows[5].cells[4].querySelector('input').value,
                dropCourse5InstructorName: drop_courses_table.rows[5].cells[5].querySelector('input').value,
                dropCourse5InstructorPermission: drop_courses_table.rows[5].cells[6].querySelector('input').checked,

                dropCourse6Code: drop_courses_table.rows[6].cells[0].querySelector('input').value,
                dropCourse6Name: drop_courses_table.rows[6].cells[1].querySelector('input').value,
                dropCourse6Section: drop_courses_table.rows[6].cells[2].querySelector('input').value,
                dropCourse6DayAndTime: drop_courses_table.rows[6].cells[3].querySelector('input').value,
                dropCourse6Credits: drop_courses_table.rows[6].cells[4].querySelector('input').value,
                dropCourse6InstructorName: drop_courses_table.rows[6].cells[5].querySelector('input').value,
                dropCourse6InstructorPermission: drop_courses_table.rows[6].cells[6].querySelector('input').checked,

                dropCourse7Code: drop_courses_table.rows[7].cells[0].querySelector('input').value,
                dropCourse7Name: drop_courses_table.rows[7].cells[1].querySelector('input').value,
                dropCourse7Section: drop_courses_table.rows[7].cells[2].querySelector('input').value,
                dropCourse7DayAndTime: drop_courses_table.rows[7].cells[3].querySelector('input').value,
                dropCourse7Credits: drop_courses_table.rows[7].cells[4].querySelector('input').value,
                dropCourse7InstructorName: drop_courses_table.rows[7].cells[5].querySelector('input').value,
                dropCourse7InstructorPermission: drop_courses_table.rows[7].cells[6].querySelector('input').checked,

                dropCourse8Code: drop_courses_table.rows[8].cells[0].querySelector('input').value,
                dropCourse8Name: drop_courses_table.rows[8].cells[1].querySelector('input').value,
                dropCourse8Section: drop_courses_table.rows[8].cells[2].querySelector('input').value,
                dropCourse8DayAndTime: drop_courses_table.rows[8].cells[3].querySelector('input').value,
                dropCourse8Credits: drop_courses_table.rows[8].cells[4].querySelector('input').value,
                dropCourse8InstructorName: drop_courses_table.rows[8].cells[5].querySelector('input').value,
                dropCourse8InstructorPermission: drop_courses_table.rows[8].cells[6].querySelector('input').checked,

                dropCourse9Code: drop_courses_table.rows[9].cells[0].querySelector('input').value,
                dropCourse9Name: drop_courses_table.rows[9].cells[1].querySelector('input').value,
                dropCourse9Section: drop_courses_table.rows[9].cells[2].querySelector('input').value,
                dropCourse9DayAndTime: drop_courses_table.rows[9].cells[3].querySelector('input').value,
                dropCourse9Credits: drop_courses_table.rows[9].cells[4].querySelector('input').value,
                dropCourse9InstructorName: drop_courses_table.rows[9].cells[5].querySelector('input').value,
                dropCourse9InstructorPermission: drop_courses_table.rows[9].cells[6].querySelector('input').checked,

                dropCourse10Code: drop_courses_table.rows[10].cells[0].querySelector('input').value,
                dropCourse10Name: drop_courses_table.rows[10].cells[1].querySelector('input').value,
                dropCourse10Section: drop_courses_table.rows[10].cells[2].querySelector('input').value,
                dropCourse10DayAndTime: drop_courses_table.rows[10].cells[3].querySelector('input').value,
                dropCourse10Credits: drop_courses_table.rows[10].cells[4].querySelector('input').value,
                dropCourse10InstructorName: drop_courses_table.rows[10].cells[5].querySelector('input').value,
                dropCourse10InstructorPermission: drop_courses_table.rows[10].cells[6].querySelector('input').checked,

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
            /*.catch(error => {
                console.error('Error:', error);
                document.getElementById('result').innerText = 'An error occurred while saving the user.';
            });*/
        }
    });

    for(let k = 0 ; k<10 ; k++){
        addCourse('drop_courses_table');
    }
    function addCourse(tableId) {
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
            }
    