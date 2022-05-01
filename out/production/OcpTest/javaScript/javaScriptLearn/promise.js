const posts = [
    {title: 'Post Tilte1', body: 'This is body 1'},
    {title: 'Post Tilte2', body: 'This is body 2'}
];

function getPosts() {
        setTimeout(() => {
        let output = '';

        posts.forEach((post, index) => {
            output += `<li>${post.title}</li>`;
        })

        document.body.innerHTML = output;
    }, 1000);
}

function createPost(post) {
   
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            posts.push(post);

            let error = false;

            if(!error) {
                resolve()
            } else{
                reject('Error: message shown here');
            }
        }, 2000);
    })
}

// createPost({title: 'title3-new', body: 'This is body 3'})
// .then(getPosts).catch((err) => {console.log(err)});

// Promise.all

const promise1 = Promise.resolve('Hello 1');
const promise2 = Promise.resolve('Hello 2');
const promise3 = 10;

const promise4 = new Promise((resolve, reject) => 
    setTimeout(resolve, 1000, 'Good Morning'));

    //fetch data
    // format data again
const promise5 = fetch('https://jsonplaceholder.typicode.com/users')
        .then(res => res.json());


// Promise.all([promise1, promise2, promise3, promise4, promise5])
//         .then((values) => {
//             console.log(values);
//         });


// Async & Await
// it is way to handle responses not the 
// different way to write the response
// It is more elegant way to handle promises

async function demoAsyncAwait() {
    await createPost({title: 'title3-Async', body: 'This is body 3'})
    .then(getPosts).catch((err) => {console.log(err)});

    getPosts();
}

// demoAsyncAwait();

async function asyncPromiseDemo() {
    await fetch('https://jsonplaceholder.typicode.com/posts/1')
        .then(res => {
            console.log(res.json())
        }
    );
}

// asyncPromiseDemo();


async function asyncfetchUsers() {

    const res = await fetch('https://jsonplaceholder.typicode.com/users');

    const data = await res.json();

    console.log(data);

    let output2 = '';

    data.forEach(value => {
        output2 += `<li>${value.name}</li>`;
    })

    

    document.body.innerHTML = output2;
}

asyncfetchUsers();