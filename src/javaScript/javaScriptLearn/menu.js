function start() {
    alert("started");
}

var myClosureFunction = function(a) {
    console.log("my first function recieves: " + a);
    var c = 10;
    return function(b) {

        // value of variable a is not lost 
        // even the function is called
        return a + b + c;

    }
}

var store = myClosureFunction(1);
console.log(store(5));


var closureExample = function(a, b, c) {

console.log("this function will return two functions");
    return {
        sunOfTwo() {
            return a+b;
        }, 
        sunOfThree() {
            return a+b+c;
        }
    }
}

var store = closureExample(3,4,5);

console.log(store.sunOfTwo);
console.log(store.sunOfTwo());
console.log(store.sunOfThree);
console.log(store.sunOfThree());