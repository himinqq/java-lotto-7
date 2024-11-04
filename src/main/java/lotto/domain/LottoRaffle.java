package lotto.domain;

import static lotto.ErrorMessage.BONUS_NUMBER_DUPLICATE_ERROR;
import static lotto.ErrorMessage.LOTTO_NUMBER_RANGE_ERROR;

import java.util.List;

public class LottoRaffle {
    private final Lotto winningLotto;
    private final int bonusNumber;

    public LottoRaffle(Lotto winningLotto, int bonusNumber) {
        validateLottoNumber(winningLotto);
        this.winningLotto = winningLotto;
        validateBonusNumber(bonusNumber);
        this.bonusNumber = bonusNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }

    public List<Integer> getWinningNumbers() {
        return winningLotto.getNumbers();
    }
    public void validateLottoNumber(Lotto lotto){
        for(Integer i : lotto.getNumbers()){
            validateLottoNumberRange(i);
        }
    }

    public void validateBonusNumber(int bonusNumber) {
        validateLottoNumberRange(bonusNumber);
        validateDuplicateWithLottoNumber(bonusNumber);
    }

    private void validateDuplicateWithLottoNumber(int bonusNumber) {
        boolean isDuplicate = getWinningNumbers().stream().anyMatch(i -> i == bonusNumber);
        if (isDuplicate) {
            throw new IllegalArgumentException(BONUS_NUMBER_DUPLICATE_ERROR.getMessage());
        }
    }

    private void validateLottoNumberRange(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException(LOTTO_NUMBER_RANGE_ERROR.getMessage());
        }
    }
}
