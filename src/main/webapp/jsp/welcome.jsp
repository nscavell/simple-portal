<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%--
  ~ JBoss, Home of Professional Open Source.
  ~ Copyright 2013, Red Hat, Inc., and individual contributors
  ~ as indicated by the @author tags. See the copyright.txt file in the
  ~ distribution for a full listing of individual contributors.
  ~
  ~ This is free software; you can redistribute it and/or modify it
  ~ under the terms of the GNU Lesser General Public License as
  ~ published by the Free Software Foundation; either version 2.1 of
  ~ the License, or (at your option) any later version.
  ~
  ~ This software is distributed in the hope that it will be useful,
  ~ but WITHOUT ANY WARRANTY; without even the implied warranty of
  ~ MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  ~ Lesser General Public License for more details.
  ~
  ~ You should have received a copy of the GNU Lesser General Public
  ~ License along with this software; if not, write to the Free
  ~ Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  ~ 02110-1301 USA, or see the FSF site: http://www.fsf.org.
  --%>

<div class="portlet-section-header">Simple JSP Hello World</div>

<br/>

<div class="portlet-font">
    Hello, what is your name ?
</div>

<br/>

<portlet:actionURL var="myActionURL"/>
<form action="<%= myActionURL %>" method="POST">
         <span class="portlet-form-field-label">Name:</span>
         <input class="portlet-form-input-field" type="text" name="name"/>
         <input class="portlet-form-button" type="Submit"/>
</form>
