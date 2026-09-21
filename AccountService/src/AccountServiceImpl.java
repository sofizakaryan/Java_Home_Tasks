class AccountServiceImpl implements AccountService {
    private Account[] _accounts;

    AccountServiceImpl(Account[] accounts)
    {
        _accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id)
    {
        if (_accounts == null) {
            return null;
        }

        for (Account a : _accounts)
        {
            if (a != null && a.getOwner() != null && a.getOwner().getId() == id)
                return a;
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value)
    {
        if (_accounts == null) {
            return 0;
        }

        int res = 0;
        for (Account a : _accounts)
        {
            if (a != null && a.getBalance() > value)
                res++;
        }
        return res;
    }
}
