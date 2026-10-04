const fs = require("fs");

fs.readFile("data.txt", "utf8", (err, data) => {

    if (err) {
        console.log("Reading failed");
        return;
    }

    console.log("File Data:");
    console.log(data);

    fs.unlink("data.txt", (err) => {

        if (err) {
            console.log("Deletion failed");
        } else {
            console.log("File deleted successfully");
        }

    });
});
