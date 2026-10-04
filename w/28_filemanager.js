const fs = require("fs");
const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log(`
1. Create File
2. Read File
3. Update File
4. Rename File
5. Delete File
`);

rl.question("Enter your choice: ", (choice) => {

    rl.question("Enter file name: ", (file) => {

        if (choice == 1) {

            rl.question("Enter data: ", (data) => {
                fs.writeFile(file, data, (err) => {
                    if (err) console.log("Error:", err);
                    else console.log("File created successfully");
                    rl.close();
                });
            });

        }

        else if (choice == 2) {

            fs.readFile(file, "utf8", (err, data) => {
                if (err) console.log("Error:", err);
                else console.log("File Data:", data);
                rl.close();
            });

        }

        else if (choice == 3) {

            rl.question("Enter new data: ", (data) => {
                fs.writeFile(file, data, (err) => {
                    if (err) console.log("Error:", err);
                    else console.log("File updated successfully");
                    rl.close();
                });
            });

        }

        else if (choice == 4) {

            rl.question("Enter new file name: ", (newName) => {

                fs.rename(file, newName, (err) => {
                    if (err) console.log("Error:", err);
                    else console.log("File renamed successfully");
                    rl.close();
                });

            });

        }

        else if (choice == 5) {

            fs.unlink(file, (err) => {
                if (err) console.log("Error:", err);
                else console.log("File deleted successfully");
                rl.close();
            });

        }

        else {
            console.log("Invalid choice");
            rl.close();
        }

    });

});
