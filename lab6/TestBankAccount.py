import unittest
from unittest.mock import patch
from bank_account import BankAccount

class TestBankAccount(unittest.TestCase):
    def test_create_account_with_valid_balance(self):
        account = BankAccount("123456", 1000.0)
        self.assertEqual(account.get_balance(), 1000.0)

    def test_create_account_with_negative_balance(self):
        with self.assertRaises(ValueError):
            BankAccount("123456", -100.0)

    def test_deposit_valid_amount(self):
        account = BankAccount("123456", 1000.0)
        account.deposit(500.0)
        self.assertEqual(account.get_balance(), 1500.0)

    def test_deposit_invalid_amount(self):
        account = BankAccount("123456", 1000.0)
        with self.assertRaises(ValueError):
            account.deposit(-100.0)

    def test_withdraw_valid_amount(self):
        account = BankAccount("123456", 1000.0)
        account.withdraw(500.0)
        self.assertEqual(account.get_balance(), 500.0)

    def test_withdraw_invalid_amount(self):
        account = BankAccount("123456", 1000.0)
        with self.assertRaises(ValueError):
            account.withdraw(-100.0)

    def test_withdraw_more_than_balance(self):
        account = BankAccount("123456", 1000.0)
        with self.assertRaises(ValueError):
            account.withdraw(1500.0)

    def test_get_balance(self):
        account = BankAccount("123456", 1000.0)
        self.assertEqual(account.get_balance(), 1000.0)

if __name__ == '__main__':
    unittest.main()

