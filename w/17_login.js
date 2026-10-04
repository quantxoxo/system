function login(username, password) {
    return new Promise((resolve, reject) => {

        if (username === "admin" && password === "1234") {
            resolve("Login Successful!");
        } else {
            reject("Invalid Username or Password");
        }

    });
}

async function checkLogin() {
    try {
        let result = await login("admin", "1234");
        console.log(result);
    } catch (error) {
        console.log(error);
    }
}

checkLogin();
