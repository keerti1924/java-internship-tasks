class BankAccount {
    #balance = 0; // Private field

    constructor(owner) {
        this.owner = owner;
    }

    deposit(amount) {
        this.#balance += amount;
    }

    getBalance() {
        return this.#balance;
    }
}

const account = new BankAccount('John');

// Deposit money
account.deposit(100);
console.log(account.getBalance()); // 100

// SyntaxError: Private field '#balance' must be declared in an enclosing class
// console.log(account.#balance); 




