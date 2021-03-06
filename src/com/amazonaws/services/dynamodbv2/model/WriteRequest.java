/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;
import java.io.Serializable;

/**
 * Write Request
 */
public class WriteRequest  implements Serializable  {

    private PutRequest putRequest;

    private DeleteRequest deleteRequest;

    /**
     * Returns the value of the PutRequest property for this object.
     *
     * @return The value of the PutRequest property for this object.
     */
    public PutRequest getPutRequest() {
        return putRequest;
    }
    
    /**
     * Sets the value of the PutRequest property for this object.
     *
     * @param putRequest The new value for the PutRequest property for this object.
     */
    public void setPutRequest(PutRequest putRequest) {
        this.putRequest = putRequest;
    }
    
    /**
     * Sets the value of the PutRequest property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param putRequest The new value for the PutRequest property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public WriteRequest withPutRequest(PutRequest putRequest) {
        this.putRequest = putRequest;
        return this;
    }
    
    
    /**
     * Returns the value of the DeleteRequest property for this object.
     *
     * @return The value of the DeleteRequest property for this object.
     */
    public DeleteRequest getDeleteRequest() {
        return deleteRequest;
    }
    
    /**
     * Sets the value of the DeleteRequest property for this object.
     *
     * @param deleteRequest The new value for the DeleteRequest property for this object.
     */
    public void setDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
    }
    
    /**
     * Sets the value of the DeleteRequest property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deleteRequest The new value for the DeleteRequest property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public WriteRequest withDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getPutRequest() != null) sb.append("PutRequest: " + getPutRequest() + ",");    	
        if (getDeleteRequest() != null) sb.append("DeleteRequest: " + getDeleteRequest() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPutRequest() == null) ? 0 : getPutRequest().hashCode()); 
        hashCode = prime * hashCode + ((getDeleteRequest() == null) ? 0 : getDeleteRequest().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof WriteRequest == false) return false;
        WriteRequest other = (WriteRequest)obj;
        
        if (other.getPutRequest() == null ^ this.getPutRequest() == null) return false;
        if (other.getPutRequest() != null && other.getPutRequest().equals(this.getPutRequest()) == false) return false; 
        if (other.getDeleteRequest() == null ^ this.getDeleteRequest() == null) return false;
        if (other.getDeleteRequest() != null && other.getDeleteRequest().equals(this.getDeleteRequest()) == false) return false; 
        return true;
    }
    
}
    