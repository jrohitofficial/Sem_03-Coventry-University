from primeFactor import PrimeFactor




def test_prime():
    PrimeFactor().of(9)
    assert PrimeFactor.of(1) == []
    assert PrimeFactor.of(2) == [2]
    assert PrimeFactor.of(3) == [3]
    assert PrimeFactor.of(5) == [5]







