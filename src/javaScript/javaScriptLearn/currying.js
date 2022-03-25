// let multiply1 = function(x, y) {
//     console.log(x* y);
// }

// let multiplyByTwo = multiply1.bind(this, 2);
// multiplyByTwo(5)

// function Currying
// // or
// let multiplyByTwo = multiply1.bind(this,);
// multiplyByTwo(2,3)

// // or
// let multiplyByTwo = multiply1.bind(this, 2 , 3); 
// multiplyByTwo(5) // will ignore 5 as will take 2, 3 as input



// let multiplyByThree = multiply1.bind(this, 3);

// multiplyByThree(5);

console.log("Method currying by closure");

let multiply = function(x) {
    return function(y) {
        console.log(x * y);
    }
}  

let multiplyByTwo = multiply(2);
multiplyByTwo(3);

let MultiplyByThree = multiply(3);
MultiplyByThree(5);


// Function IIFE
// If put in patanthesis () JS take it as expression not to be a statement
//  so invoked quickly
(function doSomething() {
    console.log("I am IIFE: Call me as soon as" 
    + "I am created to use me as variable");
  })()

-(function() {
    console.log(" IIFE I returned 10")
    return 10;
})() + 
    (function() {
    console.log(" IIFE, i returned 11 ")
    return 11;
})();

// Printed final answer

console.log(
    -(function() {
    console.log(" IIFE I returned 5")
    return 5;
  })() +
    (function() {
        console.log(" IIFE I returned 6")
            return 6;
    })()
    );


    // Controlled variable scope
(function demo1() {
    console.log('demo Printed ');
})();

// demo1(); // Unavailable as created as IIFE
// all variables(var) are declared at the top of any given function scope
// whether you like it or not(includes function declarations)

function hoist(track) {
    // jS already creates the action on top so try to give error 
    // for action on line below  on line 86
    
    // var action;
    if(track == 'I am feeling low'){
        var action = "Dance";
    } else{
        var action = "SKIP"
    }
    return action;
}
console.log(hoist("I am feeling low"));

// this works with linters as hoisting for var action;
function hoist1(track) {
    if(track == 'I am feeling low'){
         action = "Dance";
    } else{
         action = "SKIP"
    }
    var action;
    return action;
}
console.log(hoist1("I am not feeling low"));
// in ES6 let and const are not hoisted that 
// means they are blocked variables and only works in blocks they are in 
// it gives you more control.

// difference between variable that is null, undefined or undeclared.

// cases of undefined
// 1) variable declared but no defined value (not initialized)
// 2) object/array exists but nothing at key/index
// 3) function exits but doesnt return anything
// 4) falsy.

// null is "nothing a value" , means it is a value but nothing in it

// undeclared usually finds you . except when assigning a value.
// 


let foo;

console.log(typeof foo); // "undefined" but as a string
console.log(typeof foo1); // undeclared but also returns "undefined"

// preffered
console.log(foo === undefined); // true boolean

const bazz = 'undefined';
console.log(bazz == undefined); // returns false as it is string 'undefined'

const foo2 = null;

console.log(typeof foo2); // returns object // BUG in js

console.log(foo2 === null); // returns true

// AMAZING FACT

let foo4; //  undefined
const bazz2 = null;

console.log(foo4 == bazz2); // true boolean
console.log(foo4 === bazz2); // false

// difference between call stack and task queue
