const fs = require("fs");

fs.rmdir("newfolder", (err) => {
    if (err)
        console.log("Delete Error");
    else
        console.log("Directory deleted");
});
