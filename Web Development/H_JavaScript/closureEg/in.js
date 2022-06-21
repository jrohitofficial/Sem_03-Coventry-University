let count = 1;

function btnLog(){

    if(count > 3){
        alert("Not allowed");
        let btnLogBtn = document.getElementById('logBtn');
        btnLogBtn.setAttribute('disabled', true);
        return;
    }
    count++;

}