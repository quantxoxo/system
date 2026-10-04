let calculatePrice = (price, quantity) => price * quantity;

let product = "Pen";
let price = 20;
let quantity = 5;

let total = calculatePrice(price, quantity);

console.log(`
----- BILL -----
Product  : ${product}
Price    : ${price}
Quantity : ${quantity}
Total    : ${total}
---------------
`);
