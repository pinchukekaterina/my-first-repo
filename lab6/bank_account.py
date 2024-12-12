class BankAccount:
    def __init__(self, account_number: str, balance: float = 0.0):
        if balance < 0:
            raise ValueError("Initial balance cannot be negative")
        self.account_number = account_number
        self.balance = balance

    def deposit(self, amount: float):
        if amount <= 0:
            raise ValueError("Deposit amount must be positive")
        self.balance += amount

    def withdraw(self, amount: float):
        if amount <= 0:
            raise ValueError("Withdrawal amount must be positive")
        if amount > self.balance:
            raise ValueError("Insufficient funds")
        self.balance -= amount

    def get_balance(self) -> float:
        return self.balance
