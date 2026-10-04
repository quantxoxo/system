const fs = require("fs");

fs.writeFile("data.txt", "Hello Node.js", (err) => {

    if (err) {
        console.log("Error:", err);
    } else {
        console.log("File written successfully");
    }

});
