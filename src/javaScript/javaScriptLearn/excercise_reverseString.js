(function reverseString() {

    let value = 'hello';

    const valueArr = value.split(""); 
    let newString = '';
    let revString = '';
    // console.log(valueArr);
    console.log('-----------For -ve  --------------')
   
    for(let i=valueArr.length-1; i>=0; i--) {
        newString = newString + valueArr[i];
    }

    console.log(newString);
    console.log('-----------For +ve --------------')
    for(let k = 0; k< valueArr.length; k++) {
        revString = valueArr[k] + revString ;
    }
    console.log(revString)

    console.log('-----------For OF --------------')
    let anotherRev = '';

    for(let char of value) {
        anotherRev = char + anotherRev;
    }

    console.log(anotherRev);
    console.log('-----------ForEach --------------')
    let revString2 = ''; 
    value.split("").forEach( (valueChar) => {
            revString2 = valueChar +  revString2;
    })

    console.log(revString2);

    console.log('-----------Reduce function--------------')

    console.log(
        value.split('').reduce(function(newStr, char) {
        // console.log(char + newStr)
        return char + newStr;
    }, '')
    );
    console.log('-----------Reduce function ES6--------------')

    console.log(
        value.split("").reduce( (newStr, char ) => {
            return char + newStr;
        }, '')
    );

    console.log('-----------using reverse--------------')

    console.log(

        value.split("").reverse().join("")

    );

    document.write(value.split("").reverse().join(""));
}) ();
