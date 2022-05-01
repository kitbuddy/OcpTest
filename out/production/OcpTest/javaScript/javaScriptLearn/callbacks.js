const posts = [
    {title: 'Post Tilte1', body: 'This is body 1'},
    {title: 'Post Tilte2', body: 'This is body 2'}
];

function getPosts() {
    // setTimeout(function() {

    // }, 1000);

    setTimeout(() => {
        let output = '';

        posts.forEach((post, index) => {
            output += `<li>${post.title}</li>`;
        })

        document.body.innerHTML = output;
    }, 1000);
}

function createPost(post, callback) {
    setTimeout(() => {
        posts.push(post);
        callback();
    }, 2000);
   
}

createPost({title: 'Post3', body: 'This is body 3'}, getPosts);
// getPosts();

