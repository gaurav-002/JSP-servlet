function validate() {
    var errorStr = "<ul>";
    var flag = false;
    var name = document.getElementById("name").value;
    var employeeCode = document.getElementById("employeeCode").value;
    var dept = document.getElementsByName("dept");
    var day = document.getElementById("day").value;
    var month = document.getElementById("month").value;
    var year = document.getElementById("year").value;
    var address = document.getElementById("address").value;
    var trainingProgramAttended = document.getElementsByName("trainingPA");
    var trainingLeft = document.getElementById("trainingLeft").value;


    if (name == "") {
        errorStr = errorStr + "<li>Employee name is required.</li>";
        flag = true;
    }

    // if (employeeCode == "") {
    //     errorStr = errorStr + "<li>Employee code is required.</li>"
    //     flag = true;
    // }

    var deptStatus = false;
    for (var i = 0; i < dept.length; i++) {
        if (dept[i].checked) {
            deptStatus = true;
        }
    }

    if (!deptStatus) {
        errorStr = errorStr + "<li>Please select a Department.</li>";
        flag = true;
    }
    // Another way to verify select ones is below 

    // var daySelected = day.options[day.selectedIndex].value;

    if (day == -1) {
        errorStr = errorStr + "<li>Please select a day.</li>";
        flag = true;
    }


    errorStr = errorStr + "</ul>";
    if (flag) {
        document.getElementById("error").innerHTML = errorStr;
    }
    else{
        document.getElementById("frm").submit();
    }
}