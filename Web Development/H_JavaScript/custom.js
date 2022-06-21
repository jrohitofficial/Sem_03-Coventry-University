





check()


function check(){
console.log("check")
}

let a=function(){
console.log("a fun")
}

let b=()=>{
console.log("arrow fun")
}




let a = function doSmth(){
    let inputElem1 = document.getElementById("val1");
    let inputElem2 = document.getElementById("val2");

    let c = parseInt(inputElem1.value) + parseInt(inputElem2.value);

    console.log(c)
    document.getElementById('ans').innerText = c;

}



let calculateBtn = document.getElementById('calc');
console.log(calculateBtn);






calculateBtn.addEventListener('click',a());

function check1(){
    alert(1)
}



calculateBtn.onclick()


