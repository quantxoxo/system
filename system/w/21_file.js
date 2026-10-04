const fs = require("fs");

// Create and write
fs.writeFile("student.txt", "Hello Student", (err) => {

    if (err) throw err;

    console.log("File created and written");

    // Append
    fs.appendFile("student.txt", "\nWelcome to Node.js", (err) => {

        if (err) throw err;

        console.log("Data appended");

        // Read
        fs.readFile("student.txt", "utf8", (err, data) => {

            if (err) throw err;

            console.log("File Content:");
            console.log(data);

        });
    });
});
