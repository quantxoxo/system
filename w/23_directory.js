const fs = require("fs");

// Create directory
fs.mkdir("myfolder", (err) => {

    if (err) {
        console.log("Directory already exists");
    } else {
        console.log("Directory created");
    }

    // List directories/files
    fs.readdir(".", (err, files) => {
        console.log("Files and Directories:");
        console.log(files);
    });

});
