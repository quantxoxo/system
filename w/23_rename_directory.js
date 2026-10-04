const fs = require("fs");

fs.rename("myfolder", "newfolder", (err) => {
    if (err)
        console.log("Rename Error");
    else
        console.log("Directory renamed");
});
