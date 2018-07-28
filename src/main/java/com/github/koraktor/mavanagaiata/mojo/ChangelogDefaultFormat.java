/*
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the new BSD License.
 *
 * Copyright (c) 2018, Sebastian Staudt
 */

package com.github.koraktor.mavanagaiata.mojo;

import java.text.SimpleDateFormat;

import org.eclipse.jgit.api.Git;

/**
 * @author Sebastian Staudt
 */
public class ChangelogDefaultFormat extends ChangelogFormat {

    public ChangelogDefaultFormat() {
        branch = "Commits on branch \"%s\"";
        branchLink = "See Git history for changes in the \"%s\" branch since version %s at: %s";
        branchOnlyLink = "See Git history for changes in the \"%s\" branch at: %s";
        commitPrefix = " * ";
        createLinks = true;
        header = "Changelog\n=========";
        separator = "\n";
        tag = "Version %s – %s";
        tagLink = "See Git history for version %s at: %s";
    }

}
