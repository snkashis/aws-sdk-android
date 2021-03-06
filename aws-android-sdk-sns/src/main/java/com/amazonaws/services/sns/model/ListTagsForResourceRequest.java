/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#listTagsForResource(ListTagsForResourceRequest) ListTagsForResource operation}.
 * 
 *
 * @see com.amazonaws.services.sns.AmazonSNS#listTagsForResource(ListTagsForResourceRequest)
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {

    private String resourceArn;

    private String nextToken;

    /**
     * Returns the value of the ResourceArn property for this object.
     *
     * @return The value of the ResourceArn property for this object.
     */
    public String getResourceArn() {
        return resourceArn;
    }
    
    /**
     * Sets the value of the ResourceArn property for this object.
     *
     * @param resourceArn The new value for the ResourceArn property for this object.
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }
    
    /**
     * Sets the value of the ResourceArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceArn The new value for the ResourceArn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * Returns the value of the NextToken property for this object.
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The new value for the NextToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsForResourceRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceArn() != null) sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourceRequest == false) return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest)obj;
        
        if (other.getResourceArn() == null ^ this.getResourceArn() == null) return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    