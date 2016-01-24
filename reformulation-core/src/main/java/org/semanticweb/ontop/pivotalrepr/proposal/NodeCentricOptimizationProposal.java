package org.semanticweb.ontop.pivotalrepr.proposal;

import org.semanticweb.ontop.pivotalrepr.QueryNode;

public interface NodeCentricOptimizationProposal<T extends QueryNode>
        extends QueryOptimizationProposal<NodeCentricOptimizationResults<T>> {

    T getFocusNode();
}