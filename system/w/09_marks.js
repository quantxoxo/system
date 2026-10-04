let calculate = (a, b, c) => {
    let total = a + b + c;
    let average = total / 3;

    return { total, average };
};

let result = calculate(80, 70, 90);

console.log(`
Total Marks   : ${result.total}
Average Marks : ${result.average}
`);
