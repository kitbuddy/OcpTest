
console.log("closure.js");

// function outer(c) {

//     // lexical scope
//     var a = 10;
//     function inner() {
//         console.log('a is : ' + a);
//         console.log('b is : ' + b);
//         console.log('c is : ' + c);

//     }

//     var b =20;

//     return inner;
// }

// outer("hello")();

// or can be done like 

// const result_inner = outer("helloWorld");
// result_inner();

// closure are very useful and have lot of advantages 

// module pattern, function curry, memmoize and ones , encapsulation and data hiding 

// data hiding and encapsulation 

// var counter  = 0;

// function incrementCounter() {
//     counter ++;
// }

function counterDataHiding() {

    var counter  = 0;

    return function incrementCounter() {
    counter ++;
    console.log(counter);
    }
}


// conole.log(counter); // not possible to inner local variable for data hiding 

// var countResult = counterDataHiding();
// countResult();
// countResult();

// console.log("new counter from counterDataHiding is created ");
// var counterresult2 = counterDataHiding();
// counterresult2();

// -----------------------------***************----------------------------


// constructor Function
// function CounterOuter1() {

//     var a = 10; 

//     this.counterIncre = function () {
//         a++;
//         console.log("After a++ from inside: " + a);
//     }

//     this.counterDecre = function() {
//         a--;
//         console.log("After a-- from inside: " + a);
//     }
    
// } // This is converted as class below 

class CounterOuter1 {
    constructor() {

        var a = 10;

        this.counterIncre = function () {
            a++;
            console.log("After a++ from inside: " + a);
        };

        this.counterDecre = function () {
            a--;
            console.log("After a-- from inside: " + a);
        };

    }
}

function counterOuter() {

    var a = 10; 
    return {
        incrementCounter() {
                a++;
                console.log("After a++ is: " + a);

        },
        decrementCounter() {
                a--;
                console.log("After a-- is: " + a);
        }
    }
}

console.log('counterOuter');

var CounterOuter1Result = new CounterOuter1();

CounterOuter1Result.counterIncre();
CounterOuter1Result.counterDecre();

// var counterresult = counterOuter();
// counterresult.incrementCounter();
// counterresult.decrementCounter();

