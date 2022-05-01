// window.onload = function getElementfunction() {

//     const myheadingElement = document.getElementById('PageHeading');
//     myheadingElement.style.color = 'blue';
// }

window.onload = function()  {
    const myheadingElement = document.getElementById('PageHeading');
    console.log(myheadingElement)
    myheadingElement.style.color = 'blue';
}

// window.onload = function () {
//     var e = document.getElementById("id_of_div");
//     var li = document.getElementById("li");

//     e.innerHTML='Found you';
//     array = ["example1", "example2", "example3"];
    
//     for (i = 0; i < array.length; i++)
//         li.appendChild((i+1) + ": " + array[i]);
//         document.getElementById("id_of_div").innerHTML += (i+1) + ": " + array[i];


// const node = document.createElement("li");
// const textnode = document.createTextNode("Water");
// node.appendChild(textnode);
// document.getElementById("fooWater").appendChild(node);

// };

window.onload = function printMyList() {
    console.log('printMyList got called');

 let items = [
    'Blue',
    'Red',
    'White',
    'Green',
    'Black',
    'Orange'
];

// let list = document.getElementById("printFromJS");
        
// items.forEach((item) => {
//   let li = document.createElement("li");
//   li.innerText = item;
//   list.appendChild(li);
// });

let list = document.getElementById("printFromJS");
// let ul = document.createElement('ul');

// let foo = document.createElement('foo');
// foo.appendChild(ul);

items.forEach(function (item) {
    let li = document.createElement("li");
    li.innerText = item;
    list.appendChild(li);
   
});

// printFromJS.innerHTML = printFromJS
// console.log(printFromJS)
// foo.innerHTML +='abcd';
}

// printMyList();

// /*var options = [
//     set0 = ['Option 1','Option 2'],
//     set1 = ['First Option','Second Option','Third Option']
// ];

// function makeUL(array) {
// // Create the list element:
// var list = document.createElement('ul');

// for (var i = 0; i < array.length; i++) {
//     // Create the list item:
//     var item = document.createElement('li');

//     // Set its contents:
//     item.appendChild(document.createTextNode(array[i]));

//     // Add it to the list:
//     list.appendChild(item);
// }

// // Finally, return the constructed list:
// return list;
// }

// // Add the contents of options[0] to #foo:
// document.getElementById('foo').appendChild(makeUL(options[0]));*/

function makeRequest(location) {

    return new Promise((resolve, reject) => {
        console.log(`Making Requerst to ${location}`);
        if(location === 'Google') {
            resolve('Google says Hi');
        } else {
             reject('Can Only make request to Google');
        }
    })
}

function processRequest(response) {
    return new Promise((resolve, request) => {
        console.log('Processing request')
        resolve(`Extra Info for + ${response}`);
    })
}

 function doWork() {
    try{
        const resp =  makeRequest('google');
        console.log('Response Received from make Request: ' + JSON.stringify(resp));
        const processedInfo =  processRequest(resp);
        console.log('response Processed: ' + JSON.stringify(processedInfo));
    } catch(err){
        console.log(err);
    }
}

doWork();