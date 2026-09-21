void main() {
    Account[] accounts = {
            new Account(2222, 2020202, new User(1, "alo", "aa")),
            new Account(1111, 0, new User(10, "alo1", "aa1")),
            new Account(0, 1, new User(100, "alo2", "aa2")),
            new Account(2, 20, new User(1000, "alo3", "aa3")),
            new Account(3, 222222222, new User(10000, "alo4", "aa4")),
            new Account(4, 2345, new User(100000, "alo5", "aa5")),

    };
    AccountService service = new AccountServiceImpl(accounts);
    Account a = service.findAccountByOwnerId(10L);
    System.out.println(a.getId() + " " + a.getBalance() + " : " + a.getOwner().getId());
    System.out.println(service.countAccountsWithBalanceGreaterThan(19));
}
