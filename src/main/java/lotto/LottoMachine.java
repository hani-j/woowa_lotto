package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoMachine {

    private List<Lotto> issuedLottos;

    public LottoMachine() {
        issuedLottos = new ArrayList<>();
    }

    public List<Integer> issueLotto(Generator generator) {
        List<Integer> issuedLotto = generator.generate();
        Collections.sort(issuedLotto);
        issuedLottos.add(new Lotto(issuedLotto));
        return issuedLotto;
    }


    public List<Lotto> getIssuedLottos() {
        return issuedLottos;
    }
}