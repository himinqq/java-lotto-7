package lotto.domain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LottoResultChecker {
    private final LottoRaffle lottoRaffle;
    private final List<Lotto> lottos;
    private final Map<Rank, Integer> rankCount = new HashMap<>();

    public LottoResultChecker(LottoRaffle lottoRaffle, List<Lotto> lotto) {
        this.lottoRaffle = lottoRaffle;
        this.lottos = lotto;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public int findMatchCount(Lotto lotto) {
        HashSet<Integer> winningNumbers = new HashSet<>(lottoRaffle.getWinningNumbers());
        HashSet<Integer> lottoNumbers = new HashSet<>(lotto.getNumbers());
        lottoNumbers.retainAll(winningNumbers);
        return lottoNumbers.size();
    }

}