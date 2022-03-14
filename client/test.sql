ALTER TABLE `site` ADD `append_duration_rate_invoice` tinyint(1) NOT NULL DEFAULT '0' AFTER `filenote_export_categories`;
ALTER TABLE `site` ADD `contact_sort_order` tinyint(1) NOT NULL DEFAULT '1' AFTER `append_duration_rate_invoice`;
ALTER TABLE `site` ADD `case_specific_doc_sort_order` tinyint(1) NOT NULL DEFAULT '1' AFTER `contact_sort_order`;
ALTER TABLE `diary_event` ADD `notify_invitees` tinyint(1) NOT NULL DEFAULT '1' AFTER `location`;
ALTER TABLE `site` ADD `event_notify_invitees` tinyint(1) NOT NULL DEFAULT '1' AFTER `case_specific_doc_sort_order`;
ALTER TABLE `case_invoice` ADD `isCredit` TINYINT(1) NOT NULL DEFAULT '0' AFTER `credit_id`;
ALTER TABLE `site` ADD `accounts_invoice_credits` tinyint(1) NOT NULL DEFAULT '0' AFTER `event_notify_invitees`;
ALTER TABLE `site` ADD `contact_paginate_list` tinyint(1) NOT NULL DEFAULT '0' AFTER `accounts_invoice_credits`;