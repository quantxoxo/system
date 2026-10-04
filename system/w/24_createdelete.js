const fs = require("fs");

fs.writeFile("test.txt", "Hello World", (err) => {

    if (err) {
        console.log("File creation failed");
    } else {
        console.log("File created successfully");

        fs.unlink("test.txt", (err) => {

            if (err) {
                console.log("File deletion failed");
            } else {
                console.log("File deleted successfully");
            }

        });
    }
});
