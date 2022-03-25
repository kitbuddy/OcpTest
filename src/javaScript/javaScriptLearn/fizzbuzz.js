window.onload = function fizzbuzz(maxNum) {

    maxNum = 20;
    // let myTag = document.getElementById('myID');

    let myTag = document.getElementById('IntegerID');
    let li = document.createElement('li');
    for(let i=1; i<=maxNum ; i++) {
        if(i%3 == 0) {
            let li = document.createElement('li');
            
            li.innerText = 'FIZZ';
            myTag.appendChild(li);
            // document.write("FIZZ");
        } else if(i%5 == 0) {
            let li = document.createElement('li');

            li.innerText = 'BUZZ';
            myTag.appendChild(li);
        } else if(i%3 ==0 && i%5==0) {
            let li = document.createElement('li');
    // document.write("FIZZBUZZ");
            li.innerText = 'FIZZBUZZ';
            myTag.appendChild(li);
        } else {
            let li = document.createElement('li');
            li.innerText = i;
            myTag.appendChild(li);
        }


    } 
}

// fizzbuzz(20);