package be.ugent.mmlab.rml.dataset;

import org.openrdf.model.Statement;
import org.openrdf.rio.helpers.RDFHandlerBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * RML Processor
 *
 * @author mielvandersande
 */
class StatementCounter extends RDFHandlerBase {

    private int countedStatements = 0;

    @Override
    public void handleStatement(Statement st) {
        countedStatements++;
    }

    public int getCountedStatements() {
        return countedStatements;
    }
}
