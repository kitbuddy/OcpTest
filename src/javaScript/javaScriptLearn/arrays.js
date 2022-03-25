window.onload = function displayArrays() {
    
    let displayArraExample = ["ankit1","ankit2","ankit3","ankit4","ankit5" ]

    let integerArray = new Array(91,122,32,14,45,26,27,08);

   let displayArraysID = document.getElementById('displayArrays');

   displayArraExample.forEach(element => {
       let li = document.createElement('li');
        li.innerText = element;
        displayArraysID.appendChild(li);
   });


   let inteID = document.getElementById('IntegerID');
   let inteID2 = document.getElementById('IntegerID_smallest');
   let inteID4 = document.getElementById('IntegerID_largest');
   let double_using_reduce_funcId = document.getElementById('double_using_reduce');

   integerArray.forEach(inteElement => {
       let li1 = document.createElement('ul');
       li1.innerText = inteElement;
        inteID.appendChild(li1);
   });

   let smallestValue = getSmallest(integerArray);
   let largestValue = getLargest(integerArray);
   let double_each_value = doubleEachVariableReduce(integerArray);

   double_each_value.forEach(val => {
        let li5 = document.createElement('li');
        li5.innerText = val;
        double_using_reduce_funcId.appendChild(li5);
   })

   let li3 = document.createElement('li')
   li3.innerText = smallestValue;
   inteID2.appendChild(li3)

   let li4 = document.createElement('li')
   li4.innerText = largestValue;
   inteID4.appendChild(li4)

}

function getSmallest(integerArray) {
    let smallest = integerArray[0];
    for (let i = 0; i < integerArray.length; i++) {
       if(integerArray[i]>=smallest) {
            i++;
       } else{
           smallest = integerArray[i];
       }
        
    }
    console.log('smallest is : ' + smallest);
    return smallest;
}


function getLargest(integerArray) {
    let largest = integerArray[0];
    for (let i = 0; i < integerArray.length; i++) {
       if(integerArray[i]<=largest) {
            i++;
       } else{
           largest = integerArray[i];
       }
        
    }
    console.log('largest is : ' + largest);
    return largest;
}

function doubleEachVariableReduce(integerArray) {
// array.reduce(function(total, currentValue, currentIndex, arr), initialValue)

    integerArray.reduce(function (accumulator, currentValue, index) {
        accumulator[index] *= 2;
       return accumulator;
    }, integerArray);

    console.log(integerArray)
    return integerArray;
}


function doubleArrays(integerArray) {

    integerArray.reduce(function (memo, val, i) {
        memo[i] *= 2;
        return memo;
    }, integerArray);

    return integerArray;
}