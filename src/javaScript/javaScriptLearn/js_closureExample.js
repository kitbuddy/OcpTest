function binarySearch(arr,value,startPos,endPos){
  if(startPos > endPos) return -1;

  let middleIndex = Math.floor(startPos+endPos)/2;

  if(arr[middleIndex] === value) {
    return middleIndex;
  } else if(arr[middleIndex > value]) {
    return binarySearch(arr,value,startPos,middleIndex-1);
  } else{
    return binarySearch(arr,value,middleIndex+1,endPos);
  }
}   



// Each time bigFunc is called, an array of size 700 is being created,
// Modify the code so that we don't create the same array again and again

// function bigFunc(element){
//   let newArray = new Array(700).fill('♥');
//   return newArray[element];
// }
// console.log('bigFunc'); // Array is created
// console.log(bigFunc(599)); // Array is created
// console.log(bigFunc(670)); // Array is created again

// function bigFunc(){
//   let newArray = new Array(700).fill('♥');
//   return (element) => newArray[element];
// }

// let getElement = bigFunc(); // Array is created only once
// console.log(getElement(599));
// console.log(getElement(670));  

// console.log("Closure" );

// function constFuncs() {
//   let funcs = [];

//   for(var i = 0; i<10; i++) {
//     funcs[i] = () => i;
//   }
//   return funcs;
// }

// const funcs = constFuncs();
// console.log(funcs)
// console.log(funcs[5]());

document.getElementById("demo").innerHTML = typeof fruits;
document.write(myType);
// window.print(myType); // print the page
let data = ['Ram', 'Shyam', 'Sita', 'Gita' ];

let list = document.getElementById("myList");

data.forEach((item)=>{
    let li = document.createElement("li");
    li.innerText = item;
    list.appendChild(li);
})
