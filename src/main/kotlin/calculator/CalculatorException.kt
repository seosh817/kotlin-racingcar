package calculator

object CalculatorException {
    const val IS_NOT_NULL_OR_BLANK_EXCEPTION = "입력값이 null 혹은 공백일 수 없습니다."
    const val IS_NOT_ARITHMETIC_SYMBOL_EXCEPTION = "사칙연산 기호가 아닙니다."
    const val FIRST_VALUE_INVALID_EXCEPTION = "첫번째 입력값이 정수가 아니므로 변환할 수 없습니다."
    const val INTEGER_IS_NOT_LOCATED_EXCEPTION = "연산자 다음에는 정수가 와야합니다."
    const val CANT_DIVIDE_ZERO_EXCEPTION = "0으로 나눌 수 없습니다"
    const val INVALID_INPUT_EXCEPTION = "잘못된 입력입니다."
}
