package net.javaguides.bankingapp.service.impl;

import net.javaguides.bankingapp.dto.AccountDto;
import net.javaguides.bankingapp.dto.mapper.AcoountMapper;
import net.javaguides.bankingapp.entity.Account;
import net.javaguides.bankingapp.repository.AccountRepository;
import net.javaguides.bankingapp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceimpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceimpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AcoountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AcoountMapper.mapToAccountDto(savedAccount);
    }

}
