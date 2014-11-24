package org.semanticweb.ontop.ontology.impl;

/*
 * #%L
 * ontop-obdalib-core
 * %%
 * Copyright (C) 2009 - 2014 Free University of Bozen-Bolzano
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.HashSet;
import java.util.Set;

import org.semanticweb.ontop.model.Constant;
import org.semanticweb.ontop.model.ObjectConstant;
import org.semanticweb.ontop.model.Predicate;
import org.semanticweb.ontop.ontology.ClassAssertion;
import org.semanticweb.ontop.ontology.OClass;

public class ClassAssertionImpl implements ClassAssertion {
    
	private static final long serialVersionUID = 5689712345023046811L;

	private final ObjectConstant object;
	private final OClass concept;

	ClassAssertionImpl(OClass concept, ObjectConstant object) {
		this.object = object;
		this.concept = concept;
	}
 
	@Override
	public ObjectConstant getIndividual() {
		return object;
	}

	@Override
	public OClass getConcept() {
		return concept;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof ClassAssertionImpl) {
			ClassAssertionImpl other = (ClassAssertionImpl)obj;
			return concept.equals(other.concept) && object.equals(other.object);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return concept.hashCode() + object.hashCode();
	}
	
	@Override
	public String toString() {
		return concept.toString() + "(" + object.toString() + ")";
	}

}