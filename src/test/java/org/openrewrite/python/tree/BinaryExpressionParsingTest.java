package org.openrewrite.python.tree;

import org.junit.jupiter.api.Test;
import org.openrewrite.test.RewriteTest;

import static org.openrewrite.python.Assertions.python;

public class BinaryExpressionParsingTest implements RewriteTest {

    @Test
    void binaryOperatorNoSpace() {
        rewriteRun(
          python("1+2")
        );
    }

    @Test
    void binaryOperatorNoSpaceLhs() {
        rewriteRun(
          python("1+ 2")
        );
    }

    @Test
    void binaryOperatorNoSpaceRhs() {
        rewriteRun(
          python("1 +2")
        );
    }

    @Test
    void addition() {
        rewriteRun(
          python("1 + 2")
        );
    }

    @Test
    void subtraction() {
        rewriteRun(
          python("1 - 2")
        );
    }

    @Test
    void multiplication() {
        rewriteRun(
          python("1 * 2")
        );
    }

    @Test
    void division() {
        rewriteRun(
          python("1 / 2")
        );
    }


}
