/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.gatein.portal.simple.portlet;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletModeException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author <a href="mailto:nscavell@redhat.com">Nick Scavelli</a>
 */
public class PortletC extends GenericPortlet {


    @Override
    protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        renderLinks(writer, response);

        writer.write("This is the view mode !");
        writer.close();
    }

    @Override
    protected void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        renderLinks(writer, response);

        writer.write("This is the edit mode !");
        writer.close();
    }

    @Override
    protected void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        renderLinks(writer, response);

        writer.write("This is the help mode !");
        writer.close();
    }

    private static void renderLinks(PrintWriter writer, RenderResponse response) throws PortletException, IOException {
        writer.write("This portlet shows different portlet modes: ");

        // View url
        writer.write(createLink(response, PortletMode.VIEW, "View"));
        writer.write(", ");

        // Edit url
        writer.write(createLink(response, PortletMode.EDIT, "Edit"));
        writer.write(", ");

        // Help url
        writer.write(createLink(response, PortletMode.HELP, "Help"));
        writer.write("<div style='padding-top: 20px'></div>");
    }

    private static String createLink(RenderResponse response, PortletMode mode, String label) throws PortletModeException {
        PortletURL url = response.createRenderURL();
        url.setPortletMode(mode);
        return "<a href='" + url + "'>" + label + "</a>";
    }
}
