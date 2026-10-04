const fs = require("fs");

fs.readFile("data.txt", "utf8", (err, data) => {

    if (err) {
        console.log("Reading failed");
        return;
    }

    console.log("Old Data:");
    console.log(data);

    fs.appendFile("data.txt", "\nNew Data Added", (err) => {

        if (err) {
            console.log("Append failed");
        } else {
            console.log("Data appended successfully");
        }

    });
});
