const fs = require("fs");

fs.writeFile("data.txt", "Hello Node.js", (err) => {

    if (err) {
        console.log("File creation failed");
        return;
    }

    console.log("File created successfully");

    fs.readFile("data.txt", "utf8", (err, data) => {

        if (err) {
            console.log("File reading failed");
        } else {
            console.log("File content:");
            console.log(data);
        }

    });
});
