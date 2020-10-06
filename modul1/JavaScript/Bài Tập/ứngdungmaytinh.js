
let number1 = document.getElementById("number1");
let number2 = document.getElementById("number2");

function addTwoNumber() {
    let result = parseInt(number1.value) +  parseInt(number2.value);
    document.getElementById("result").value = result;

}
function subTwoNumber() {
    let result = parseInt(number1.value) -  parseInt(number2.value);
    document.getElementById("result").value = result;

}
function multiTwoNumber() {
    let result = parseInt(number1.value) *  parseInt(number2.value);
    document.getElementById("result").value = result;

}
function divTwoNumber() {
    let result = parseInt(number1.value) /  parseInt(number2.value);
    document.getElementById("result").value = result;

}


