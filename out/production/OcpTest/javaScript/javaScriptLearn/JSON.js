let displayID = document.getElementById('displayJSON');
async function callExternalAPI() {

    let url = 'https://reqres.in/api/products/3';
    let response = await fetch(url);
    
    return response;
}

let response = callExternalAPI();

response.then( dataVal => dataVal.text())
        .then(printresponse => 
            document.getElementById('displayJSON')
                // .innerHTML = JSON.stringify(printresponse, undefined, 2));
                .innerHTML = JSON.stringify(JSON.parse(printresponse),null, 2));



fetch ('https://reqbin.com/echo/get/json')
.then(x => x.text())
.then(y => document.getElementById("demo").innerHTML = y);

var o1 = { a: 1, b: 1, c: 1 };
var o2 = { b: 2, c: 2 };
var o3 = { c: 3 };

var obj = Object.assign({}, o1, o2, o3);
console.log(obj);

const obj2 = { a: 1 ,b: 2 ,c: 3 }

console.log(Object.keys(obj2));
console.log(Object.values(obj2));
console.log(Object.entries(obj2));

// this.restService.post('/projects', true, JSON.stringify(project))
//     .subscribe((response: Project) => {
//             const newProject: Project = new Project();
//             newProject.deserialize(response); // Deserialize response 
                                                    // to object of class 
//   });