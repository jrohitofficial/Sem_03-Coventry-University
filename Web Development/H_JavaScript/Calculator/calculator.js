
let tak = function(val) {
    console.log("da" + val)
    document.getElementById('screen12').innerHTML = val;
}



let btn0 = document.getElementById('btn0');
let btn1 = document.getElementById('btn1');
let btn2 = document.getElementById('btn2');
let btn3 = document.getElementById('btn3');
let btn4 = document.getElementById('btn4');
let btn5 = document.getElementById('btn5');
let btn6 = document.getElementById('btn6');
let btn7 = document.getElementById('btn7');
let btn8 = document.getElementById('btn8');
let btn9 = document.getElementById('btn9');

let btnAdd = document.getElementById('btnAdd');
let btnSub = document.getElementById('btnSub');
let btnMul = document.getElementById('btnMul');
let btnDiv = document.getElementById('btnDiv');

let btnClr = document.getElementById('btnClear');
let btnEqual = document.getElementById('btnResult');


btn0.addEventListener('click', tak(0))
btn1.addEventListener('click', tak(1))
// btn2[0].onclick(tak(2))
// btn3[0].onclick(tak(3))
// btn4[0].onclick(tak(4))
// btn5[0].onclick(tak(5))
// btn6[0].onclick(tak(6))
// btn7[0].onclick(tak(7))
// btn8[0].onclick(tak(8))
// btn9[0].onclick(tak(9))

// btnAdd[0].onclick()
// btnSub[0].onclick()
// btnDiv[0].onclick()
// btnMul[0].onclick()

// btnClr[0].onclick(() => {document.getElementById('screen12').innerHTML = " "});
// btnEqual.onclick()

