
(function reverseString(value) {
    value = '-123456'

    let reverseIntValue = value.toString().split("").reverse().join("");

    let reverseIntValue_Integer = parseInt(reverseIntValue);

    console.log(Math.sign(value));
    // incase we try to reverse negative value
    let reverseIntValue_Integer2 = reverseIntValue_Integer * Math.sign(value); 
    console.log(typeof reverseIntValue);
    console.log(typeof reverseIntValue_Integer);

    console.log(reverseIntValue_Integer2);
}) ;

function capitaliseString() {

    str = 'this is my string';

    const strArr = str.toLowerCase().split(' ');
    console.log(strArr);
    for (let i = 0; i< strArr.length; i++) {

        strArr[i] = strArr[i].substring(0,1).toUpperCase()
                    + strArr[i].substring(1);
       
    }
    return strArr.join(' ');

}

console.log(capitaliseString());
console.log("-------Capitalize again by using map------");

function capitaliseString2() {
    str = 'this is my string';
    
    return str.toLowerCase()
            .split(" ")
            .map( word => {
                return word[0].toUpperCase() + word.substring(1)
            }).join(" ")
}

console.log(capitaliseString2());

console.log("-------Capitalize again by using regular expressions------");

function capitaliseString2() {
    str = 'this is my string';

    console.log();
    return str.replace(/\b[a-z]/gi, function(char) {

        return char.toUpperCase();
    })
}

console.log(capitaliseString2());

function maxCharacterInStr() {

    str = 'this is javascriptaaaaaa';
    maxChar ='';
    maxNum =0;
    // returns the char occurs max number of times in string

    let charMap = {};
    str.split('').forEach(function(char) {
        if(charMap[char]){
            charMap[char]++;
        } else {
            charMap[char] = 1;
        }

    });

    console.log(charMap);

    for(let character in charMap) {

        if(charMap[character]>maxNum) {
            maxNum = charMap[character];
            maxChar = character;
        }
    }

    return maxChar;

}

console.log(maxCharacterInStr());



  
