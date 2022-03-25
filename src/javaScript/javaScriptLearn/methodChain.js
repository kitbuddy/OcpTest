/*
let o = {
    m: function() {
        let self = this;
        this === o;
        f();

        function f() {
            console.log("f function is called");
            this === o;
            console.log(this === o);
            self === o;
            console.log(self === o);
        }
        
        const t = ( function() {
                console.log("inside t function");
                console.log(this === o);
            }).bind(this);

            t();

            const aa = () => {
                console.log("inside aa function");
                console.log(this === o)
            }
            aa();
    }
};

o.m();

const t = ( function() {
    console.log("inside t outer function");
    console.log(this === o);
}).bind(this);

t();


const aa = () => {
    console.log("inside aa outer function");

    console.log(this === o)
}

aa();
*/
console.log("closure -------------------");

let uniqueInteger = ( function() {
    let counter1 = 0;
    return function() {return counter1++};

}());

console.log(uniqueInteger());
console.log(uniqueInteger());
count=0;

function counter() {

    let count = 0;
    return {
        counterRun: function() {
            count++;
    console.log(count);

        },
        resetCounter: function() {
            count = 0;
            console.log('reset Called: ' + count);
        }
    }
}

let countResult = counter();
let countResult2 = counter();

countResult.counterRun();
countResult.counterRun();
countResult.counterRun();
countResult.counterRun();
countResult.resetCounter();
countResult.counterRun();

countResult2.counterRun();
document.write(count); 